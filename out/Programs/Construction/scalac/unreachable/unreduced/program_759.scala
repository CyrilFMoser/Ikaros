package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[(CC_A,CC_A)], b: (Char,CC_A), c: CC_A) extends T_A[Char]
case class CC_C(a: T_A[T_B[(Int,Int)]], b: CC_A) extends T_A[Char]
case class CC_D[C](a: (CC_B,Byte)) extends T_B[C]
case class CC_E[D](a: D) extends T_B[D]
case class CC_F[E](a: T_B[E], b: Char) extends T_B[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_), _) => 1 
  case CC_C(_, _) => 2 
}
}