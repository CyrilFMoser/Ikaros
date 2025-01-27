package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C]
case class CC_A[E](a: (Int,Byte)) extends T_A[E]
case class CC_D() extends T_B[T_A]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_B Int (T_A (T_A Byte Byte) Int))