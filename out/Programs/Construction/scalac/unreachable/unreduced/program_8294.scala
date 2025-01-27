package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (Boolean,T_A[Byte, Byte])) extends T_A[D, E]
case class CC_B[F](a: Boolean) extends T_A[F, CC_A[T_B[Byte], Int]]
case class CC_C(a: T_B[T_A[Boolean, Boolean]]) extends T_B[CC_A[CC_A[(Char,Byte), Boolean], T_A[Boolean, Char]]]
case class CC_D(a: T_A[CC_C, T_B[Boolean]], b: CC_B[CC_B[CC_C]], c: Byte) extends T_B[CC_A[CC_A[(Char,Byte), Boolean], T_A[Boolean, Char]]]
case class CC_E(a: (T_B[CC_D],CC_A[CC_C, CC_C]), b: T_A[CC_A[CC_D, CC_D], T_A[CC_D, (Byte,Char)]]) extends T_B[CC_A[CC_A[(Char,Byte), Boolean], T_A[Boolean, Char]]]

val v_a: T_B[CC_A[CC_A[(Char,Byte), Boolean], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_B(true), _) => 1 
  case CC_D(_, CC_B(false), _) => 2 
  case CC_E((_,CC_A(_)), CC_A((_,_))) => 3 
}
}