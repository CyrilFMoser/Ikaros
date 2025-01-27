package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (Boolean,T_A[T_B, T_B])) extends T_A[(T_B,(T_B,T_B)), Int]
case class CC_B() extends T_A[(T_B,(T_B,T_B)), Int]
case class CC_C(a: Int) extends T_A[(T_B,(T_B,T_B)), Int]
case class CC_D(a: CC_C, b: T_B, c: CC_B) extends T_B

val v_a: T_A[(T_B,(T_B,T_B)), Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}