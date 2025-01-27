package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[Byte]
case class CC_B(a: T_A[T_A[Int]], b: (CC_A,CC_A), c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: Boolean, b: T_A[Byte], c: CC_B) extends T_A[T_A[CC_B]]

val v_a: T_A[T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_C(_, CC_B(_, (_,_), _), _) => 1 
}
}