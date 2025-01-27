package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: (Byte,CC_A), b: T_B, c: Boolean) extends T_B
case class CC_C(a: Boolean, b: T_A[T_B], c: ((CC_A,T_B),CC_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(true, _, ((_,_),CC_B(_, _, _))) => 1 
  case CC_C(false, _, ((_,_),CC_B(_, _, _))) => 2 
}
}