package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Boolean, Int]], b: (T_A[Boolean, Byte],T_A[Char, Char]), c: T_A[T_A[Boolean, Boolean], T_A[Boolean, (Byte,Boolean)]]) extends T_A[T_A[Int, T_A[Byte, Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]
case class CC_B(a: Int) extends T_A[T_A[Int, T_A[Byte, Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]
case class CC_C(a: CC_A, b: T_A[(CC_A,CC_B), Byte]) extends T_A[T_A[Int, T_A[Byte, Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]

val v_a: T_A[T_A[Int, T_A[Byte, Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _) => 3 
}
}