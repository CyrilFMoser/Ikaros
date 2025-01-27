package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Int, Byte],T_A[Char, Char]), b: (T_A[Byte, Boolean],T_A[Char, Boolean])) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Byte]], Int]
case class CC_B(a: CC_A, b: T_A[(CC_A,(Int,Byte)), T_A[CC_A, CC_A]], c: T_A[T_A[CC_A, Int], T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Byte]], Int]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Byte]], Int]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), (_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}