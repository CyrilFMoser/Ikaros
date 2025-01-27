package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, (Boolean,Char)], Int], b: T_A[Boolean, T_A[Int, Boolean]]) extends T_A[T_A[T_A[Int, Int], Boolean], T_A[T_A[(Boolean,Byte), Byte], T_A[Char, Boolean]]]
case class CC_B(a: T_A[CC_A, (CC_A,CC_A)], b: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Int, Int], Boolean], T_A[T_A[(Boolean,Byte), Byte], T_A[Char, Boolean]]]
case class CC_C[C](a: C) extends T_A[T_A[T_A[Int, Int], Boolean], T_A[T_A[(Boolean,Byte), Byte], T_A[Char, Boolean]]]

val v_a: T_A[T_A[T_A[Int, Int], Boolean], T_A[T_A[(Boolean,Byte), Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}