package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B], c: T_A[(Char,Boolean)]) extends T_A[(Char,Boolean)]
case class CC_B(a: Boolean, b: CC_A, c: (Boolean,Boolean)) extends T_B
case class CC_C(a: Char, b: T_A[(Char,Boolean)], c: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,true)) => 0 
  case CC_B(_, _, (_,false)) => 1 
  case CC_C(_, _, _) => 2 
}
}