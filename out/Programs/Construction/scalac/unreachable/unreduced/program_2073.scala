package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (T_A[Boolean, Boolean],T_A[Int, Char])]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[D, (T_A[Boolean, Boolean],T_A[Int, Char])]
case class CC_C(a: Char) extends T_A[CC_A[CC_B[Int]], (T_A[Boolean, Boolean],T_A[Int, Char])]

val v_a: T_A[Byte, (T_A[Boolean, Boolean],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}