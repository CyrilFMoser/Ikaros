package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Int,Boolean), Char], T_A[Char, Byte]], b: T_A[T_A[Byte, (Boolean,Int)], T_A[Byte, Boolean]], c: T_A[(Int,Byte), T_A[Byte, (Char,Boolean)]]) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Byte]], T_A[T_A[Int, Int], Boolean]]
case class CC_B() extends T_A[CC_A, Boolean]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Byte]], T_A[T_A[Int, Int], Boolean]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Boolean, Byte]], T_A[T_A[Int, Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}