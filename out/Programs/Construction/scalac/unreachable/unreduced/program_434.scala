package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Boolean,Byte), Byte], Int], b: T_A[T_A[Boolean, Char], T_A[Int, Byte]], c: T_A[T_A[Char, Byte], Boolean]) extends T_A[T_A[T_A[Int, Int], T_A[Byte, (Int,Byte)]], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]
case class CC_B() extends T_A[T_A[T_A[Int, Int], T_A[Byte, (Int,Byte)]], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]
case class CC_C(a: T_A[T_A[CC_B, CC_A], CC_B], b: CC_A) extends T_A[T_A[T_A[Int, Int], T_A[Byte, (Int,Byte)]], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, (Int,Byte)]], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
}
}