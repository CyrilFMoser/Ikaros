package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[((Byte,Byte),Boolean), T_A[Boolean, Byte]], C]
case class CC_B[D](a: (T_A[Byte, Boolean],CC_A[Int]), b: T_A[D, D]) extends T_A[T_A[((Byte,Byte),Boolean), T_A[Boolean, Byte]], D]

val v_a: T_A[T_A[((Byte,Byte),Boolean), T_A[Boolean, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}