package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Int, Byte], T_A[Char, (Int,Int)]], b: T_B[T_B[Char]], c: T_A[Boolean, T_A[Char, Char]]) extends T_A[T_A[T_A[Boolean, Int], T_B[(Boolean,Int)]], T_A[T_A[(Int,Byte), Boolean], T_A[Char, Byte]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Int], T_B[(Boolean,Int)]], T_A[T_A[(Int,Byte), Boolean], T_A[Char, Byte]]]
case class CC_C[D](a: T_B[D], b: T_B[D]) extends T_B[D]
case class CC_D() extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]

val v_a: T_A[T_A[T_A[Boolean, Int], T_B[(Boolean,Int)]], T_A[T_A[(Int,Byte), Boolean], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _), _) => 0 
  case CC_B() => 1 
}
}