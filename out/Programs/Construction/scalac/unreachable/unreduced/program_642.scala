package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Char), Char], T_A[Char, Byte]], T_A[T_A[Int, Char], T_A[(Int,Byte), Char]]]
case class CC_B(a: CC_A, b: (Int,CC_A), c: T_A[T_A[Int, CC_A], T_A[Byte, Int]]) extends T_A[T_A[T_A[(Boolean,Char), Char], T_A[Char, Byte]], T_A[T_A[Int, Char], T_A[(Int,Byte), Char]]]
case class CC_C(a: T_A[Char, CC_A], b: Char, c: CC_A) extends T_A[T_A[T_A[(Boolean,Char), Char], T_A[Char, Byte]], T_A[T_A[Int, Char], T_A[(Int,Byte), Char]]]

val v_a: T_A[T_A[T_A[(Boolean,Char), Char], T_A[Char, Byte]], T_A[T_A[Int, Char], T_A[(Int,Byte), Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,_), _) => 1 
  case CC_C(_, _, CC_A()) => 2 
}
}