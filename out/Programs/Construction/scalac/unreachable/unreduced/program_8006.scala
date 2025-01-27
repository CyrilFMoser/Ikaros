package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Int], T_A[Char, Boolean]], b: Byte) extends T_A[T_A[T_A[(Byte,Char), Boolean], T_A[(Boolean,Boolean), Byte]], T_A[T_A[Char, Boolean], T_A[Int, Char]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], CC_A]) extends T_A[T_A[T_A[(Byte,Char), Boolean], T_A[(Boolean,Boolean), Byte]], T_A[T_A[Char, Boolean], T_A[Int, Char]]]
case class CC_C(a: Byte, b: Int) extends T_A[T_A[T_A[(Byte,Char), Boolean], T_A[(Boolean,Boolean), Byte]], T_A[T_A[Char, Boolean], T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[(Byte,Char), Boolean], T_A[(Boolean,Boolean), Byte]], T_A[T_A[Char, Boolean], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}