package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[(T_B,(Int,Int))]]
case class CC_B(a: T_B, b: CC_A, c: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: ((CC_A,T_B),CC_C), b: (T_A[(Byte,Boolean)],CC_B), c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C() => 1 
  case CC_D(_, (_,CC_B(_, _, _)), CC_C()) => 2 
}
}