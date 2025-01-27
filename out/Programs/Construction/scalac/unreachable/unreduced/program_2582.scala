package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, Char]) extends T_A
case class CC_B(a: Int, b: T_A, c: (T_B[(Byte,Byte), CC_A],T_A)) extends T_A
case class CC_C[C]() extends T_B[T_A, C]
case class CC_D(a: T_A, b: ((Char,T_A),T_B[T_A, CC_B])) extends T_B[T_A, (Byte,T_A)]

val v_a: T_B[T_A, (Byte,T_A)] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, CC_A(_, _), (_,_)), _) => 1 
  case CC_D(CC_B(_, CC_B(_, _, _), (_,_)), _) => 2 
}
}
// This is not matched: CC_D(CC_A(_, _), _)