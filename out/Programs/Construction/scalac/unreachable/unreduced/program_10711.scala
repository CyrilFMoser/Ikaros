package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Char],T_A[Boolean, Byte])) extends T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], C]
case class CC_B(a: (CC_A[Byte],((Int,Int),Char)), b: Byte) extends T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[T_A[Char, Int], CC_A[Boolean]]]
case class CC_C[D](a: CC_B, b: T_A[D, D], c: D) extends T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], D]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[T_A[Char, Int], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B((_,_), _), _, _) => 2 
}
}