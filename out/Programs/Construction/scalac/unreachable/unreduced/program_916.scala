package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[Byte]]
case class CC_B(a: CC_A, b: T_A[T_A[Byte]], c: T_A[T_B]) extends T_A[T_A[Byte]]
case class CC_C(a: (CC_B,CC_B)) extends T_A[T_A[Byte]]
case class CC_D(a: Byte, b: CC_B) extends T_B
case class CC_E(a: CC_D, b: T_A[T_A[Byte]]) extends T_B

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _)) => 0 
  case CC_A(CC_E(_, _)) => 1 
  case CC_B(CC_A(_), CC_A(_), _) => 2 
  case CC_B(CC_A(_), CC_B(_, _, _), _) => 3 
  case CC_B(CC_A(_), CC_C(_), _) => 4 
}
}
// This is not matched: CC_C(_)