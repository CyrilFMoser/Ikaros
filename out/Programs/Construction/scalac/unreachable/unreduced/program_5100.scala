package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (Byte,T_B[T_A, CC_A])) extends T_A
case class CC_C[C]() extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
}
}