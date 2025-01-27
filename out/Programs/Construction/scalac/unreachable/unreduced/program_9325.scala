package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Int,T_A[(Boolean,Char), (Boolean,Byte)])) extends T_A[C, (T_A[T_B, Boolean],Boolean)]
case class CC_B(a: T_B) extends T_A[(Byte,CC_A[T_B]), (T_A[T_B, Boolean],Boolean)]
case class CC_C(a: T_B) extends T_A[(Byte,CC_A[T_B]), (T_A[T_B, Boolean],Boolean)]
case class CC_D(a: T_A[T_A[Int, CC_B], T_B], b: ((CC_C,CC_C),Int)) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, ((_,_),12)) => 0 
  case CC_E(0) => 1 
  case CC_E(_) => 2 
}
}
// This is not matched: CC_D(_, ((_,_),_))