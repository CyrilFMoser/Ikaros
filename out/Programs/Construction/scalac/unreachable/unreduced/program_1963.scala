package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[Boolean]) extends T_A
case class CC_B(a: Int, b: T_B[T_A], c: T_B[T_A]) extends T_A
case class CC_C(a: (T_B[Int],T_B[T_A]), b: CC_B, c: CC_B) extends T_B[T_A]
case class CC_D(a: T_B[T_A], b: T_B[T_A]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C((_,CC_C(_, _, _)), _, CC_B(_, _, CC_C(_, _, _))) => 0 
  case CC_C((_,CC_C(_, _, _)), _, CC_B(_, _, CC_D(_, _))) => 1 
  case CC_C((_,CC_D(_, _)), _, CC_B(_, _, CC_C(_, _, _))) => 2 
  case CC_C((_,CC_D(_, _)), _, CC_B(_, _, CC_D(_, _))) => 3 
  case CC_D(CC_C(_, _, _), CC_C(_, _, _)) => 4 
  case CC_D(CC_C(_, _, _), CC_D(_, _)) => 5 
  case CC_D(CC_D(CC_C(_, _, _), _), CC_C(_, _, _)) => 6 
  case CC_D(CC_D(CC_C(_, _, _), _), CC_D(_, _)) => 7 
  case CC_D(CC_D(CC_D(_, _), _), CC_C(_, _, _)) => 8 
  case CC_D(CC_D(CC_D(_, _), _), CC_D(_, _)) => 9 
}
}