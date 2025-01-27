package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[((Byte,Byte),Boolean)]]
case class CC_B() extends T_A[T_B[((Byte,Byte),Boolean)]]
case class CC_C(a: Char, b: T_A[Int]) extends T_A[T_B[((Byte,Byte),Boolean)]]
case class CC_D[C]() extends T_B[C]

val v_a: T_A[T_B[((Byte,Byte),Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}