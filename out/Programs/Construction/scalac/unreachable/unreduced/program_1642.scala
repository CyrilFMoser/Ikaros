package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Int],T_B[Byte])) extends T_A[C]
case class CC_B(a: T_B[(Char,Boolean)]) extends T_A[T_A[CC_A[Char]]]
case class CC_C() extends T_A[T_A[CC_A[Char]]]
case class CC_D(a: CC_B, b: T_A[Char], c: CC_A[CC_A[CC_B]]) extends T_B[Byte]
case class CC_E[D](a: D) extends T_B[Byte]
case class CC_F(a: (T_A[CC_B],CC_B)) extends T_B[Byte]

val v_a: T_A[T_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)