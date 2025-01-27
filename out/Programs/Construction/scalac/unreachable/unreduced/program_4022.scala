package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B(a: T_B[(CC_A,Byte), T_B[T_A, CC_A]], b: T_A) extends T_A
case class CC_C(a: Boolean, b: CC_B) extends T_A
case class CC_D[C](a: CC_B, b: C) extends T_B[Byte, C]
case class CC_E[D](a: CC_A, b: T_B[Byte, D], c: D) extends T_B[Byte, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_A(_, _))) => 0 
  case CC_A(_, (_,CC_B(_, _))) => 1 
  case CC_A(_, (_,CC_C(_, _))) => 2 
  case CC_B(_, CC_A((_,_), _)) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 6 
  case CC_B(_, CC_C(_, _)) => 7 
  case CC_C(true, _) => 8 
  case CC_C(false, _) => 9 
}
}