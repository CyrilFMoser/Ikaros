package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,T_A), b: (T_B[(Int,Byte), T_A],T_B[T_A, T_A])) extends T_A
case class CC_B(a: (CC_A,T_A), b: T_B[T_B[Byte, (Char,Int)], CC_A], c: CC_A) extends T_A
case class CC_C(a: T_A, b: CC_A) extends T_A
case class CC_D[C](a: CC_C, b: CC_A) extends T_B[(T_A,CC_B), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _)), _) => 0 
  case CC_A((_,CC_C(_, _)), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_A((_,CC_B(_, _, _)), _)