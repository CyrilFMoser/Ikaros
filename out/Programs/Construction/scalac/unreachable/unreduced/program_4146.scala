package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: T_A[T_B[Byte]], c: T_B[T_A[Char]]) extends T_A[((Byte,Byte),T_B[(Boolean,Byte)])]
case class CC_B(a: CC_A, b: T_B[T_A[Int]], c: CC_A) extends T_A[((Byte,Byte),T_B[(Boolean,Byte)])]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: Int, b: T_A[D]) extends T_B[D]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
}
}