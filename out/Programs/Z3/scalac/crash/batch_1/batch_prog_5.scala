package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,T_A), b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Boolean, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A((CC_A(_, _, _),CC_B()), CC_A(_, _, _), CC_C(_, _)) => 1 
  case CC_A(_, CC_A(_, _, _), _) => 2 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_C(_, _), CC_C(_, _)) => 3 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), _, CC_A(_, _, _)) => 4 
  case CC_A((CC_B(),CC_C(_, _)), _, CC_B()) => 5 
  case CC_A((CC_A(_, _, _),CC_B()), CC_A(_, _, _), CC_A(_, _, _)) => 6 
  case CC_A((CC_B(),CC_B()), CC_B(), CC_A(_, _, _)) => 7 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_A(_, _, _), CC_A(_, _, _)) => 8 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_A(_, _, _), CC_B()) => 9 
  case CC_A((CC_B(),CC_C(_, _)), CC_B(), _) => 10 
  case CC_A(_, CC_C(_, _), CC_A(_, _, _)) => 11 
  case CC_A((CC_C(_, _),CC_B()), CC_A(_, _, _), CC_A(_, _, _)) => 12 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_C(_, _), CC_C(_, _)) => 13 
  case CC_A(_, CC_C(_, _), CC_B()) => 14 
  case CC_A((CC_C(_, _),CC_B()), CC_A(_, _, _), CC_C(_, _)) => 15 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 16 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_B()) => 17 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), _, CC_B()) => 18 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_A(_, _, _), _) => 19 
  case CC_A(_, CC_A(_, _, _), CC_C(_, _)) => 20 
  case CC_A(_, CC_C(_, _), _) => 21 
  case CC_A((CC_C(_, _),CC_B()), CC_B(), _) => 22 
  case CC_A((CC_B(),CC_A(_, _, _)), CC_C(_, _), CC_B()) => 23 
  case CC_A((CC_B(),CC_C(_, _)), CC_A(_, _, _), CC_B()) => 24 
  case CC_A((CC_B(),CC_C(_, _)), CC_A(_, _, _), _) => 25 
  case CC_A((CC_B(),CC_B()), CC_B(), CC_B()) => 26 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_C(_, _), CC_B()) => 27 
  case CC_A((CC_A(_, _, _),CC_B()), CC_A(_, _, _), _) => 28 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_A(_, _, _), CC_C(_, _)) => 29 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), _, CC_C(_, _)) => 30 
  case CC_A(_, CC_B(), _) => 31 
  case CC_A((CC_C(_, _),CC_B()), CC_C(_, _), CC_A(_, _, _)) => 32 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_B(), CC_C(_, _)) => 33 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_B(), CC_A(_, _, _)) => 34 
  case CC_A((CC_B(),CC_C(_, _)), _, CC_C(_, _)) => 35 
  case CC_A((CC_B(),CC_B()), CC_B(), _) => 36 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 37 
  case CC_A(_, CC_C(_, _), CC_C(_, _)) => 38 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_A(_, _, _), CC_B()) => 39 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(), CC_C(_, _)) => 40 
  case CC_A((CC_B(),CC_A(_, _, _)), CC_C(_, _), CC_A(_, _, _)) => 41 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 42 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_C(_, _), CC_C(_, _)) => 43 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_C(_, _), CC_A(_, _, _)) => 44 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_A(_, _, _), _) => 45 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), _, CC_B()) => 46 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_B(), _) => 47 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 48 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), CC_C(_, _)) => 49 
  case CC_A((CC_A(_, _, _),CC_B()), CC_C(_, _), _) => 50 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_C(_, _), CC_A(_, _, _)) => 51 
  case CC_A((CC_A(_, _, _),CC_B()), CC_B(), CC_A(_, _, _)) => 52 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_A(_, _, _), CC_A(_, _, _)) => 53 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_C(_, _)) => 54 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_B(), CC_A(_, _, _)) => 55 
  case CC_A((CC_B(),CC_C(_, _)), CC_C(_, _), CC_B()) => 56 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_B(), CC_C(_, _)) => 57 
  case CC_A(_, _, CC_B()) => 58 
  case CC_A((CC_B(),CC_B()), CC_A(_, _, _), CC_B()) => 59 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 60 
  case CC_A((CC_B(),CC_A(_, _, _)), _, _) => 61 
  case CC_A((CC_B(),CC_A(_, _, _)), _, CC_B()) => 62 
  case CC_A((CC_A(_, _, _),CC_B()), _, CC_B()) => 63 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_A(_, _, _), CC_B()) => 64 
  case CC_A((CC_B(),CC_A(_, _, _)), CC_B(), _) => 65 
  case CC_A((CC_A(_, _, _),CC_B()), _, CC_C(_, _)) => 66 
  case CC_A((CC_C(_, _),CC_B()), _, _) => 67 
  case CC_A((CC_B(),CC_B()), _, CC_B()) => 68 
  case CC_A((CC_B(),CC_B()), CC_A(_, _, _), CC_C(_, _)) => 69 
  case CC_A((CC_A(_, _, _),CC_B()), CC_B(), CC_C(_, _)) => 70 
  case CC_A((CC_B(),CC_B()), CC_C(_, _), CC_C(_, _)) => 71 
  case CC_A((CC_B(),CC_A(_, _, _)), _, CC_C(_, _)) => 72 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 73 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_C(_, _), CC_C(_, _)) => 74 
  case CC_A((CC_B(),CC_A(_, _, _)), CC_C(_, _), _) => 75 
  case CC_A((CC_B(),CC_C(_, _)), CC_C(_, _), CC_C(_, _)) => 76 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_B(), _) => 77 
  case CC_A((CC_C(_, _),CC_B()), CC_C(_, _), CC_B()) => 78 
  case CC_A((CC_B(),CC_B()), CC_A(_, _, _), CC_A(_, _, _)) => 79 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), _, CC_C(_, _)) => 80 
  case CC_A((CC_B(),CC_C(_, _)), CC_C(_, _), CC_A(_, _, _)) => 81 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_B(), CC_C(_, _)) => 82 
  case CC_A((CC_C(_, _),CC_C(_, _)), _, _) => 83 
  case CC_A((CC_B(),CC_C(_, _)), CC_B(), CC_C(_, _)) => 84 
  case CC_A((CC_A(_, _, _),CC_B()), CC_A(_, _, _), CC_B()) => 85 
  case CC_A((CC_B(),CC_A(_, _, _)), CC_A(_, _, _), CC_B()) => 86 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_B(), CC_B()) => 87 
  case CC_A((CC_B(),CC_C(_, _)), CC_C(_, _), _) => 88 
  case CC_A((CC_B(),CC_C(_, _)), CC_A(_, _, _), CC_C(_, _)) => 89 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_B(), _) => 90 
  case CC_A((CC_A(_, _, _),CC_C(_, _)), CC_C(_, _), CC_B()) => 91 
  case CC_A((CC_C(_, _),CC_C(_, _)), _, CC_B()) => 92 
  case CC_A((CC_A(_, _, _),CC_B()), CC_B(), CC_B()) => 93 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_A(_, _, _), _) => 94 
  case CC_A((CC_B(),CC_B()), CC_C(_, _), CC_A(_, _, _)) => 95 
  case CC_A((CC_B(),CC_C(_, _)), CC_A(_, _, _), CC_A(_, _, _)) => 96 
  case CC_A((CC_A(_, _, _),CC_B()), CC_B(), _) => 97 
  case CC_A((CC_C(_, _),CC_C(_, _)), _, CC_A(_, _, _)) => 98 
  case CC_A((CC_B(),CC_B()), _, _) => 99 
  case CC_A(_, CC_B(), CC_B()) => 100 
  case CC_A((CC_C(_, _),CC_A(_, _, _)), CC_C(_, _), CC_B()) => 101 
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_C(_, _), CC_A(_, _, _)) => 102 
}
}
// This is not matched: (CC_A T_A
//      (Tuple Wildcard (CC_A Wildcard Wildcard Wildcard Wildcard T_A))
//      Wildcard
//      Wildcard
//      T_A)