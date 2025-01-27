package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Boolean], T_A[(Boolean,Boolean), Int]], b: T_A[T_A[(Boolean,Char), (Char,Boolean)], T_A[Int, Char]], c: T_A[T_A[Boolean, Byte], Boolean]) extends T_A[T_A[T_A[Int, Boolean], T_A[(Byte,Char), Int]], T_A[T_A[Char, Char], T_A[Char, Char]]]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], T_A[(Byte,Char), Int]], T_A[T_A[Char, Char], T_A[Char, Char]]]
case class CC_C(a: CC_B, b: Byte, c: (Int,CC_B)) extends T_A[T_A[T_A[Int, Boolean], T_A[(Byte,Char), Int]], T_A[T_A[Char, Char], T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[(Byte,Char), Int]], T_A[T_A[Char, Char], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _, (_,CC_B())) => 2 
}
}