package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B(a: CC_A[(Byte,Boolean)]) extends T_A[Int, T_A[Int, T_A[Int, Int]]]
case class CC_C[D](a: T_A[D, D], b: CC_B) extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[Int, T_A[Int, T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}