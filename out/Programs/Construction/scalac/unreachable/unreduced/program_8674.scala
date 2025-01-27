package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G]() extends T_A[E, F]
case class CC_B(a: T_B[CC_A[Char, Int, Boolean], T_B[(Byte,Byte), Boolean]], b: T_A[T_B[Char, Boolean], Boolean]) extends T_A[Char, T_B[(Int,Byte), CC_A[Boolean, Boolean, (Char,Byte)]]]
case class CC_C(a: (T_A[CC_B, (Boolean,Byte)],T_A[CC_B, CC_B])) extends T_A[Char, T_B[(Int,Byte), CC_A[Boolean, Boolean, (Char,Byte)]]]
case class CC_D[H]() extends T_B[T_B[H, H], H]

val v_a: T_A[Char, T_B[(Int,Byte), CC_A[Boolean, Boolean, (Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C((CC_A(),CC_A())) => 2 
}
}