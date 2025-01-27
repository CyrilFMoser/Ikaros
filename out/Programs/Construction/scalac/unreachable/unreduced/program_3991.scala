package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Char, (T_A[(Char,Byte), T_B],T_B)]
case class CC_B(a: T_A[T_A[CC_A, CC_A], (T_B,Byte)], b: (Byte,CC_A)) extends T_A[Char, (T_A[(Char,Byte), T_B],T_B)]
case class CC_C(a: CC_A, b: CC_A, c: CC_B) extends T_A[Char, (T_A[(Char,Byte), T_B],T_B)]
case class CC_D(a: CC_A, b: CC_A, c: T_B) extends T_B
case class CC_E(a: Int) extends T_B

val v_a: T_A[Char, (T_A[(Char,Byte), T_B],T_B)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_A())) => 1 
}
}
// This is not matched: CC_C(CC_A(), _, _)