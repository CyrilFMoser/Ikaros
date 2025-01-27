package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_A[Byte])) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: (Char,CC_B)) extends T_B
case class CC_D(a: T_B, b: T_A[CC_A], c: T_A[Int]) extends T_B
case class CC_E(a: T_B, b: T_A[CC_B], c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((_,_)) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_D(_, _, _)