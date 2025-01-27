package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], b: T_A[T_A[Char, Int], T_A[Byte, (Boolean,Char)]]) extends T_A[T_A[T_A[Char, (Boolean,Int)], T_A[Char, Byte]], T_A[Int, (Boolean,(Char,Boolean))]]
case class CC_B() extends T_A[T_A[T_A[Char, (Boolean,Int)], T_A[Char, Byte]], T_A[Int, (Boolean,(Char,Boolean))]]
case class CC_C[C](a: Char, b: CC_A) extends T_A[T_A[T_A[Char, (Boolean,Int)], T_A[Char, Byte]], T_A[Int, (Boolean,(Char,Boolean))]]

val v_a: T_A[T_A[T_A[Char, (Boolean,Int)], T_A[Char, Byte]], T_A[Int, (Boolean,(Char,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _)) => 2 
}
}