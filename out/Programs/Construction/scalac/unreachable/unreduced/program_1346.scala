package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Char], c: C) extends T_A[C, (T_A[Boolean, Boolean],T_A[Byte, Int])]
case class CC_B[D]() extends T_A[D, (T_A[Boolean, Boolean],T_A[Byte, Int])]

val v_a: T_A[Byte, (T_A[Boolean, Boolean],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}