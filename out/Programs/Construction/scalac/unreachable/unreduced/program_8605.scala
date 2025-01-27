package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Int, Byte],T_A[Boolean, Boolean]), b: T_A[Byte, T_A[(Char,Byte), Boolean]]) extends T_A[T_A[T_A[Char, Boolean], T_A[Int, Int]], T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]]]
case class CC_B(a: (CC_A,CC_A), b: Byte, c: T_A[CC_A, CC_A]) extends T_A[(Byte,T_A[CC_A, CC_A]), CC_A]
case class CC_C() extends T_A[T_A[T_A[Char, Boolean], T_A[Int, Int]], T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Int, Int]], T_A[T_A[Char, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}