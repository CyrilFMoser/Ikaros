package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D, c: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: (T_B[Char, Int],T_A[Int]), c: E) extends T_A[E]
case class CC_C(a: Boolean, b: CC_B[(Byte,Byte)], c: ((Boolean,Char),Byte)) extends T_B[Byte, CC_B[T_B[Boolean, Byte]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B(_, _, _)) => 0 
  case CC_B(CC_A(_, _, _), (_,_), _) => 1 
}
}
// This is not matched: CC_A(_, _, CC_A(_, _, _))