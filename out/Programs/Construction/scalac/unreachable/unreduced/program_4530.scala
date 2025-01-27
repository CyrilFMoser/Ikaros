package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[C](a: (T_A,(Byte,CC_B)), b: Boolean, c: CC_A) extends T_B[Byte, C]
case class CC_D[D](a: CC_A, b: (T_B[Byte, T_A],T_B[Byte, CC_B])) extends T_B[Byte, D]

val v_a: CC_C[T_A] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_),(_,_)), _, _) => 0 
  case CC_C((CC_B(_, _),(_,_)), _, _) => 1 
}
}