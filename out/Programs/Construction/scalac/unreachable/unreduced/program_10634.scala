package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C]) extends T_A[C]
case class CC_B[D](a: (T_A[Char],T_B[Int]), b: CC_A[CC_A[D]]) extends T_A[D]
case class CC_C(a: (T_A[Int],(Byte,Byte))) extends T_A[T_A[T_A[(Byte,Byte)]]]
case class CC_D(a: CC_C) extends T_B[CC_C]
case class CC_E(a: T_B[(CC_D,CC_C)], b: Byte, c: CC_C) extends T_B[CC_C]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_A(_, _),_), _) => 1 
}
}
// This is not matched: CC_B((CC_B(_, _),_), _)