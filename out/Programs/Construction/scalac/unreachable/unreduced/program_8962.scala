package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,Char)]
case class CC_B(a: T_A[T_B]) extends T_A[Char]
case class CC_C(a: (CC_B,CC_A), b: T_B, c: (T_B,T_B)) extends T_A[(T_B,Char)]
case class CC_D(a: T_A[(T_B,Char)], b: T_A[Char]) extends T_B

val v_a: T_A[(T_B,Char)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_D(CC_A(), CC_B(_)), _) => 1 
  case CC_C(_, CC_D(CC_C(_, _, _), CC_B(_)), _) => 2 
}
}