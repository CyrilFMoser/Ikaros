package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B]
case class CC_C[B](a: CC_A) extends T_A[T_B]
case class CC_D[C](a: T_A[C], b: CC_B) extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[CC_B], b: T_B, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_)) => 0 
  case CC_E() => 1 
  case CC_F(_, CC_D(_, _), CC_D(_, _)) => 2 
  case CC_F(_, CC_E(), CC_D(_, _)) => 3 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_D(_, _)) => 4 
  case CC_F(_, CC_F(_, _, CC_E()), CC_D(_, _)) => 5 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_D(_, _)) => 6 
  case CC_F(_, CC_D(_, _), CC_E()) => 7 
  case CC_F(_, CC_E(), CC_E()) => 8 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_E()) => 9 
  case CC_F(_, CC_F(_, _, CC_E()), CC_E()) => 10 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_E()) => 11 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_D(_, _), CC_D(_, _))) => 12 
  case CC_F(_, CC_E(), CC_F(_, CC_D(_, _), CC_D(_, _))) => 13 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_D(_, _), CC_D(_, _))) => 14 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_D(_, _), CC_D(_, _))) => 15 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_D(_, _), CC_D(_, _))) => 16 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_D(_, _), CC_E())) => 17 
  case CC_F(_, CC_E(), CC_F(_, CC_D(_, _), CC_E())) => 18 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_D(_, _), CC_E())) => 19 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_D(_, _), CC_E())) => 20 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_D(_, _), CC_E())) => 21 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_D(_, _), CC_F(_, _, _))) => 22 
  case CC_F(_, CC_E(), CC_F(_, CC_D(_, _), CC_F(_, _, _))) => 23 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_D(_, _), CC_F(_, _, _))) => 24 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_D(_, _), CC_F(_, _, _))) => 25 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_D(_, _), CC_F(_, _, _))) => 26 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_E(), CC_D(_, _))) => 27 
  case CC_F(_, CC_E(), CC_F(_, CC_E(), CC_D(_, _))) => 28 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_E(), CC_D(_, _))) => 29 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_E(), CC_D(_, _))) => 30 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_E(), CC_D(_, _))) => 31 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_E(), CC_E())) => 32 
  case CC_F(_, CC_E(), CC_F(_, CC_E(), CC_E())) => 33 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_E(), CC_E())) => 34 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_E(), CC_E())) => 35 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_E(), CC_E())) => 36 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_E(), CC_F(_, _, _))) => 37 
  case CC_F(_, CC_E(), CC_F(_, CC_E(), CC_F(_, _, _))) => 38 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_E(), CC_F(_, _, _))) => 39 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_E(), CC_F(_, _, _))) => 40 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_E(), CC_F(_, _, _))) => 41 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_F(_, _, _), CC_D(_, _))) => 42 
  case CC_F(_, CC_E(), CC_F(_, CC_F(_, _, _), CC_D(_, _))) => 43 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_F(_, _, _), CC_D(_, _))) => 44 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_F(_, _, _), CC_D(_, _))) => 45 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_F(_, _, _), CC_D(_, _))) => 46 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_F(_, _, _), CC_E())) => 47 
  case CC_F(_, CC_E(), CC_F(_, CC_F(_, _, _), CC_E())) => 48 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_F(_, _, _), CC_E())) => 49 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_F(_, _, _), CC_E())) => 50 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_F(_, _, _), CC_E())) => 51 
  case CC_F(_, CC_D(_, _), CC_F(_, CC_F(_, _, _), CC_F(_, _, _))) => 52 
  case CC_F(_, CC_E(), CC_F(_, CC_F(_, _, _), CC_F(_, _, _))) => 53 
  case CC_F(_, CC_F(_, _, CC_D(_, _)), CC_F(_, CC_F(_, _, _), CC_F(_, _, _))) => 54 
  case CC_F(_, CC_F(_, _, CC_E()), CC_F(_, CC_F(_, _, _), CC_F(_, _, _))) => 55 
  case CC_F(_, CC_F(_, _, CC_F(_, _, _)), CC_F(_, CC_F(_, _, _), CC_F(_, _, _))) => 56 
}
}