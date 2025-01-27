package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[(Int,CC_A)], b: T_A[T_A[Boolean]], c: CC_A) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), _)) => 0 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_A(CC_A(_, _), _)) => 1 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _), _)) => 2 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(_, _, _), _)) => 3 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_A(CC_B(_, _, _), _)) => 4 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), _)) => 5 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_, CC_A(_, _), CC_A(_, _))) => 6 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_B(_, CC_A(_, _), CC_A(_, _))) => 7 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_A(_, _), CC_A(_, _))) => 8 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_, CC_B(_, _, _), CC_A(_, _))) => 9 
  case CC_A(CC_A(_, CC_B(_, _, _)), CC_B(_, CC_B(_, _, _), CC_A(_, _))) => 10 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_B(_, _, _), CC_A(_, _))) => 11 
  case CC_B(_, CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 12 
  case CC_B(_, CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 13 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 14 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 15 
  case CC_B(_, CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 16 
  case CC_B(_, CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 17 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 18 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 19 
  case CC_B(_, CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 20 
  case CC_B(_, CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 21 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 22 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 23 
  case CC_B(_, CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 24 
  case CC_B(_, CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 25 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 26 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 27 
}
}