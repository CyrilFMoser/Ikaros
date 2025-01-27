package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_A[T_A[Byte]], c: CC_A) extends T_A[T_A[Byte]]
case class CC_C(a: T_A[T_A[Byte]], b: CC_A) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_A(_), _) => 4 
  case CC_C(CC_B(_, _, _), _) => 5 
  case CC_C(CC_C(_, _), _) => 6 
}
}