package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Char]]]
case class CC_B(a: T_B[CC_A], b: T_B[T_B[CC_A]], c: Int) extends T_A[T_A[T_B[Char]]]
case class CC_C(a: Char, b: CC_B) extends T_B[T_B[CC_B]]
case class CC_D() extends T_B[T_B[CC_B]]
case class CC_E[C](a: T_B[C], b: (T_B[CC_D],Byte)) extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_, (_,_)) => 1 
}
}
// This is not matched: CC_D()