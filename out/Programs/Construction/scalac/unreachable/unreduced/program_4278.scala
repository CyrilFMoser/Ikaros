package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean) extends T_A[T_A[(Byte,Boolean), T_A[Boolean, Boolean]], T_A[T_A[(Char,Byte), Boolean], T_A[Byte, Int]]]
case class CC_B(a: T_A[CC_A, CC_A], b: Int) extends T_A[T_A[(Byte,Boolean), T_A[Boolean, Boolean]], T_A[T_A[(Char,Byte), Boolean], T_A[Byte, Int]]]

val v_a: T_A[T_A[(Byte,Boolean), T_A[Boolean, Boolean]], T_A[T_A[(Char,Byte), Boolean], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 12) => 1 
  case CC_B(_, _) => 2 
}
}