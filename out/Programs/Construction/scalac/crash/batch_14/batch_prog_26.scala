package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(T_A[Int, Byte],T_A[(Boolean,Int), Byte]), C]

val v_a: T_A[(T_A[Int, Byte],T_A[(Boolean,Int), Byte]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}