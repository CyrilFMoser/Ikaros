package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[((Byte,Byte),Byte), T_A[Byte, Byte]], b: T_A[T_A[Int, Char], Boolean]) extends T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Int, Int]]]
case class CC_B() extends T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Int, Int]]]
case class CC_C() extends T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Int, Int]]]

val v_a: T_A[T_A[Byte, Boolean], T_A[T_A[Char, Char], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}