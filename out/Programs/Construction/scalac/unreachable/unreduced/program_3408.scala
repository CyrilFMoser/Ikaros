package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[T_A[Boolean]], c: (T_B,T_A[T_B])) extends T_A[(Int,Char)]
case class CC_B() extends T_A[(Int,Char)]
case class CC_C(a: T_B, b: ((Char,Int),T_A[CC_A])) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_B) extends T_B

val v_a: T_A[(Int,Char)] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B() => 2 
}
}