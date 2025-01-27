package Program_7 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: T_A) extends T_A
case class CC_C[B](a: B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_B(_))) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_C(_))) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(CC_A(_, _))) => 3 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(CC_B(_))) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(CC_C(_))) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_C(_)) => 6 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, CC_A(_, _))) => 7 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, CC_B(_))) => 8 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, CC_C(_))) => 9 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_B(CC_A(_, _))) => 10 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_B(CC_B(_))) => 11 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_B(CC_C(_))) => 12 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_C(_)) => 13 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_A(_, CC_A(_, _))) => 14 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_A(_, CC_B(_))) => 15 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_A(_, CC_C(_))) => 16 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_B(CC_A(_, _))) => 17 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_B(CC_B(_))) => 18 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_B(CC_C(_))) => 19 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_C(_)) => 20 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 21 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, CC_B(_))) => 22 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, CC_C(_))) => 23 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_B(CC_A(_, _))) => 24 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_B(CC_B(_))) => 25 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_B(CC_C(_))) => 26 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_C(_)) => 27 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(_, CC_A(_, _))) => 28 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(_, CC_B(_))) => 29 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(_, CC_C(_))) => 30 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_B(CC_A(_, _))) => 31 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_B(CC_B(_))) => 32 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_B(CC_C(_))) => 33 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_C(_)) => 34 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_A(_, CC_A(_, _))) => 35 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_A(_, CC_B(_))) => 36 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_A(_, CC_C(_))) => 37 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_B(CC_A(_, _))) => 38 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_B(CC_B(_))) => 39 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_B(CC_C(_))) => 40 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_C(_)) => 41 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 42 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, CC_B(_))) => 43 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, CC_C(_))) => 44 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_B(CC_A(_, _))) => 45 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_B(CC_B(_))) => 46 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_B(CC_C(_))) => 47 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_C(_)) => 48 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_A(_, CC_A(_, _))) => 49 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_A(_, CC_B(_))) => 50 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_A(_, CC_C(_))) => 51 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_B(CC_A(_, _))) => 52 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_B(CC_B(_))) => 53 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_B(CC_C(_))) => 54 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_C(_)) => 55 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_A(_, CC_A(_, _))) => 56 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_A(_, CC_B(_))) => 57 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_A(_, CC_C(_))) => 58 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_B(CC_A(_, _))) => 59 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_B(CC_B(_))) => 60 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_B(CC_C(_))) => 61 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_C(_)) => 62 
  case CC_A(CC_B(_), CC_A(_, CC_A(_, _))) => 63 
  case CC_A(CC_B(_), CC_A(_, CC_B(_))) => 64 
  case CC_A(CC_B(_), CC_A(_, CC_C(_))) => 65 
  case CC_A(CC_B(_), CC_B(CC_A(_, _))) => 66 
  case CC_A(CC_B(_), CC_B(CC_B(_))) => 67 
  case CC_A(CC_B(_), CC_B(CC_C(_))) => 68 
  case CC_A(CC_B(_), CC_C(_)) => 69 
  case CC_A(CC_C(_), CC_A(_, CC_A(_, _))) => 70 
  case CC_A(CC_C(_), CC_A(_, CC_B(_))) => 71 
  case CC_A(CC_C(_), CC_A(_, CC_C(_))) => 72 
  case CC_A(CC_C(_), CC_B(CC_A(_, _))) => 73 
  case CC_A(CC_C(_), CC_B(CC_B(_))) => 74 
  case CC_A(CC_C(_), CC_B(CC_C(_))) => 75 
  case CC_A(CC_C(_), CC_C(_)) => 76 
  case CC_B(CC_A(CC_A(_, _), _)) => 77 
  case CC_B(CC_A(CC_B(_), _)) => 78 
  case CC_B(CC_A(CC_C(_), _)) => 79 
  case CC_B(CC_B(CC_A(_, _))) => 80 
  case CC_B(CC_B(CC_B(_))) => 81 
  case CC_B(CC_B(CC_C(_))) => 82 
  case CC_B(CC_C(_)) => 83 
  case CC_C(_) => 84 
}
}