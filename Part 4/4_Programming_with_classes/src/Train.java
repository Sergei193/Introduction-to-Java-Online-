import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Train {
    //       04.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//    Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//    номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//    Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//    назначения должны быть упорядочены по времени отправления.

    private String destinationName;
    private int numberTrain;
    private Date departureTime;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public Train(String destinationName, int numberTrain, Date departureTime) {
        this.destinationName = destinationName;
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
    }

    protected static void informationOfTrain(Train[] trains, int numberTrain) {
        for (Train train : trains) {
            if (numberTrain == train.numberTrain) {
                System.out.println(train.toString());
            }
        }
    }

    protected static void sortTrainOfNumber(Train[] trains) {
        Train trainTemp;
        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 0; i < trains.length - 1; i++) {
                isSorted = true;
                if (trains[i].numberTrain > trains[i + 1].numberTrain) {
                    trainTemp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = trainTemp;
                    isSorted = false;
                }
            }
        }
    }

    protected static void sortTrainOfDestination(Train[] trains) {
        Train trainTemp;
        boolean isSorted = false;
        while (!isSorted) {
            for (int i = 0; i < trains.length - 1; i++) {
                isSorted = true;
                int compare = trains[i].destinationName.compareTo(trains[i + 1].destinationName);
                if (compare > 0) {
                    trainTemp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = trainTemp;
                    isSorted = false;
                } else if (compare == 0) {
                    if (trains[i].departureTime.compareTo(trains[i + 1].departureTime) > 0) {
                        trainTemp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = trainTemp;
                        isSorted = false;
                    }
                }
            }
        }

    }

    protected static void showTrain(Train[] trains) {
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }

    @Override

    public String toString() {
        return "Train - >" + "destinationName : " + destinationName + ", numberTrain : " + numberTrain + ", departureTime :" + departureTime;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return destinationName.equals(train.destinationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName);
    }

}


