package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,Boolean)], b: T_B[T_A]) extends T_A
case class CC_B(a: (Char,T_A), b: T_A) extends T_B[Byte]
case class CC_C(a: T_B[Byte]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _)), _) => 0 
  case CC_C(CC_B((_,_), CC_A(_, _))) => 1 
  case CC_C(CC_C(CC_B(_, _))) => 2 
  case CC_C(CC_C(CC_C(_))) => 3 
}
}