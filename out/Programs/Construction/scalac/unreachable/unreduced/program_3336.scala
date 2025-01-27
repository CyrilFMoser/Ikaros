package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, (T_A[Int, Boolean],(Boolean,Int))]
case class CC_B[D](a: Boolean) extends T_A[D, (T_A[Int, Boolean],(Boolean,Int))]

val v_a: T_A[Byte, (T_A[Int, Boolean],(Boolean,Int))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}