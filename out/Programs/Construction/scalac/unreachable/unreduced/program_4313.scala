package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (((Int,Byte),Int),T_A[Char, Int])]
case class CC_B[D](a: (T_A[Int, Byte],CC_A[Int])) extends T_A[D, (((Int,Byte),Int),T_A[Char, Int])]
case class CC_C[E](a: T_A[E, E], b: Boolean) extends T_A[E, (((Int,Byte),Int),T_A[Char, Int])]

val v_a: T_A[Int, (((Int,Byte),Int),T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()